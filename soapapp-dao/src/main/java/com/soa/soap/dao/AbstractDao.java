package com.soa.soap.dao;

import org.jboss.logging.Logger;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public abstract class AbstractDao {

    @PersistenceContext(unitName = "primary", type = PersistenceContextType.EXTENDED)
    protected EntityManager entityManager;

    public <T> void create(T object) {
        getLogger().info("create - invoked " + object);
        entityManager.persist(object);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public <T> void createNewTransaction(T object) {
        getLogger().info("createNewTransaction - invoked " + object);
        entityManager.persist(object);
    }

    public <T> boolean update(T object) {
        getLogger().info("update - invoked " + object);
        entityManager.merge(object);
        getLogger().info("update - record udapted");
        return true;
    }

    public <T> boolean delete(Object pk) {
        getLogger().info("delete - invoked " + pk);
        T object = entityManager.find(getType(), pk);
        entityManager.remove(object);

        return true;
    }

    public <T> List<T> list(final int offset, final int limit) {
        getLogger().info("list - invoked");
        final CriteriaQuery<T> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(getType());
        criteriaQuery.from(getType());
        final TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        query.setFirstResult(offset).setMaxResults(limit);
        return query.getResultList();
    }

    public <T> T get(Object pk) {
        getLogger().info("get - invoked for: " + pk);
        return entityManager.find(getType(), pk);
    }

    protected <T> Optional<T> getSingleResult(List<T> resultList) {
        getLogger().info("getSingleResult invoked...");
        return resultList.isEmpty() ? Optional.empty() : Optional.of(resultList.get(0));
    }

    protected void fillQueryParameters(final Query query, final Map<String, Object> filters) {
        for (final Map.Entry<String, Object> filter : filters.entrySet()) {
            query.setParameter(filter.getKey(), filter.getValue());
        }
    }

    protected <T> T getSingleResult(final TypedQuery<T> query) {
        try {
            return query.getSingleResult();
        } catch (final NoResultException e) {
            return null;
        }
    }

//    public Optional<Proposal> getProposalByProposalContractId(String contractNo) {
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Proposal> query = cb.createQuery(Proposal.class);
//        Root<Proposal> root = query.from(Proposal.class);
//        query.where(cb.equal(root.get(Proposal_.contractNo), contractNo));
//        query.select(root);
//        return checkForSingleResult(entityManager.createQuery(query).getResultList());
//    }
//
//    public List<Proposal> getProposalsByBorrowerId(long customerId) {
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Proposal> query = cb.createQuery(Proposal.class);
//        Root<Proposal> root = query.from(Proposal.class);
//        Join<Proposal, Product> product = root.join(Proposal_.product);
//        Join<Product, Customer> borrower = product.join(Product_.borrower);
//        query.where(cb.equal(borrower.get(Customer_.id), customerId));
//        query.distinct(true);
//        return entityManager.createQuery(query).getResultList();
//    }
//
//    public List<Proposal> getProposalBySellerIdAndStage(long sellerId, List<ProposalStage> proposalStage) {
//        return entityManager.createQuery("SELECT p FROM Proposal p " +
//                "WHERE p.subject.subjectSeller.id = :sellerId " +
//                "AND p.deletionDate IS NULL " +
//                "AND p.proposalStage IN :proposalStage", Proposal.class)
//                .setParameter("sellerId", sellerId)
//                .setParameter("proposalStage", proposalStage)
//                .getResultList();
//    }

    protected abstract Logger getLogger();

    protected abstract <T> Class<T> getType();
}

