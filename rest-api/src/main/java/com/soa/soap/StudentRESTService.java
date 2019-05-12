package com.soa.soap;

//import com.soa.soap.converter.Base64Converter;
//import com.soa.soap.dao.StudentsDao;
//import entity.StudentEntity;
//import com.soa.soap.enums.Gender;

//import javax.ws.rs.*;
//import java.io.IOException;
//import java.util.List;
//
////jwt
//
//@Path("/students")
//@Consumes({"application/json"})
//@Produces({"application/json"})
//public class StudentRESTService {
//
//    private StudentsDao dao;
//
//    public StudentRESTService() {
//        this.dao = new StudentsDao();
//    }
//
//    @POST
//    @Path("/")
//    public void addStudent(@NotNull StudentEntity student) {
//        dao.create(student);
//    }
//
//    @GET
//    @Path("/")
//    public List<StudentEntity> getAllStudents() {
//        return dao.list(0, 1000);
//    }
//
//    @GET
//    @Path("/{id}")
//    public StudentEntity getStudentById(@NotNull @PathParam(value = "id") Integer id) {
//        return dao.get(id);
//    }
//
//    @GET
//    @Path("/first/{firstName}")
//    public List<StudentEntity> getStudentsByFirstName(@NotNull @PathParam(value = "firstName") String firstName) {
//        return dao.list(0, 1000);
//    }
//
//    @GET
//    @Path("/last/{lastName}")
//    public List<StudentEntity> getStudentsByLastName(@NotNull @PathParam(value = "lastName") String lastName) {
//        return dao.list(0, 1000);
//    }
//
//    @GET
//    @Path("/email/{email}")
//    public List<StudentEntity> getStudentsByEmail(@NotNull @PathParam(value = "email") String email) {
//        return dao.list(0, 1000);
//    }
//
//    @GET
//    @Path("/gender/{gender}")
//    public List<StudentEntity> getStudentsByGender(@NotNull @PathParam(value = "gender") Gender gender) {
//        return dao.list(0, 1000);
//    }
//
//    @PUT
//    @Path("/{id}")
//    public void updateStudent(@NotNull @PathParam(value = "id") Integer id,
//                              @NotNull StudentEntity student) {
//        dao.update(student);
//    }
//
//    @DELETE
//    @Path("/{id}")
//    public void deleteStudentById(@NotNull @PathParam(value = "id") Integer id) {
//        dao.delete(id);
//    }
//
//    @PUT
//    @Path("/image/{id}/{filePath}")
//    public void uploadBase64ImageToStudent(@NotNull @PathParam(value = "id") Integer id,
//                                           @NotNull @PathParam(value = "filePath") String filePath) throws IOException {
//        StudentEntity entity = dao.get(id);
//        entity.setAvatar(Base64Converter.convertToBase64(filePath));
//        dao.update(entity);
//    }
//
//    @GET
//    @Path("/image/{id}/{filePath}")
//    public void downloadStudentAvatar(@NotNull @PathParam(value = "id") Integer id,
//                                      @NotNull @PathParam(value = "filePath") String filePath) throws IOException {
//        StudentEntity entity = dao.get(id);
//        Base64Converter.convertBase64ToImage(entity.getAvatar(), filePath);
//    }
//
//    @GET
//    @Path("/image/base64/{id}")
//    public String downloadStudentAvatarAsBase64(@NotNull @PathParam(value = "id") Integer id) throws IOException {
//        StudentEntity entity = dao.get(id);
//        return entity.getAvatar();
//    }
//
//}
