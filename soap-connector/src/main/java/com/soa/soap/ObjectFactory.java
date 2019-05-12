
package com.soa.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.soa.soap package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddStudent_QNAME = new QName("http://soap.soa.com/", "addStudent");
    private final static QName _AddStudentResponse_QNAME = new QName("http://soap.soa.com/", "addStudentResponse");
    private final static QName _DeleteAllStudents_QNAME = new QName("http://soap.soa.com/", "deleteAllStudents");
    private final static QName _DeleteAllStudentsResponse_QNAME = new QName("http://soap.soa.com/", "deleteAllStudentsResponse");
    private final static QName _DeleteStudentById_QNAME = new QName("http://soap.soa.com/", "deleteStudentById");
    private final static QName _DeleteStudentByIdResponse_QNAME = new QName("http://soap.soa.com/", "deleteStudentByIdResponse");
    private final static QName _DownloadStudentAvatar_QNAME = new QName("http://soap.soa.com/", "downloadStudentAvatar");
    private final static QName _DownloadStudentAvatarAsBase64_QNAME = new QName("http://soap.soa.com/", "downloadStudentAvatarAsBase64");
    private final static QName _DownloadStudentAvatarAsBase64Response_QNAME = new QName("http://soap.soa.com/", "downloadStudentAvatarAsBase64Response");
    private final static QName _DownloadStudentAvatarResponse_QNAME = new QName("http://soap.soa.com/", "downloadStudentAvatarResponse");
    private final static QName _GetAllStudents_QNAME = new QName("http://soap.soa.com/", "getAllStudents");
    private final static QName _GetAllStudentsResponse_QNAME = new QName("http://soap.soa.com/", "getAllStudentsResponse");
    private final static QName _GetStudentById_QNAME = new QName("http://soap.soa.com/", "getStudentById");
    private final static QName _GetStudentByIdResponse_QNAME = new QName("http://soap.soa.com/", "getStudentByIdResponse");
    private final static QName _GetStudentsByEmail_QNAME = new QName("http://soap.soa.com/", "getStudentsByEmail");
    private final static QName _GetStudentsByEmailResponse_QNAME = new QName("http://soap.soa.com/", "getStudentsByEmailResponse");
    private final static QName _GetStudentsByFirstName_QNAME = new QName("http://soap.soa.com/", "getStudentsByFirstName");
    private final static QName _GetStudentsByFirstNameResponse_QNAME = new QName("http://soap.soa.com/", "getStudentsByFirstNameResponse");
    private final static QName _GetStudentsByGender_QNAME = new QName("http://soap.soa.com/", "getStudentsByGender");
    private final static QName _GetStudentsByGenderResponse_QNAME = new QName("http://soap.soa.com/", "getStudentsByGenderResponse");
    private final static QName _GetStudentsByLastName_QNAME = new QName("http://soap.soa.com/", "getStudentsByLastName");
    private final static QName _GetStudentsByLastNameResponse_QNAME = new QName("http://soap.soa.com/", "getStudentsByLastNameResponse");
    private final static QName _Hello_QNAME = new QName("http://soap.soa.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://soap.soa.com/", "helloResponse");
    private final static QName _UpdateStudent_QNAME = new QName("http://soap.soa.com/", "updateStudent");
    private final static QName _UpdateStudentResponse_QNAME = new QName("http://soap.soa.com/", "updateStudentResponse");
    private final static QName _UploadBase64ImageToStudent_QNAME = new QName("http://soap.soa.com/", "uploadBase64ImageToStudent");
    private final static QName _UploadBase64ImageToStudentResponse_QNAME = new QName("http://soap.soa.com/", "uploadBase64ImageToStudentResponse");
    private final static QName _IOException_QNAME = new QName("http://soap.soa.com/", "IOException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soa.soap
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudentsByLastNameResponse }
     */
    public GetStudentsByLastNameResponse createGetStudentsByLastNameResponse() {
        return new GetStudentsByLastNameResponse();
    }

    /**
     * Create an instance of {@link GetStudentsByGenderResponse }
     */
    public GetStudentsByGenderResponse createGetStudentsByGenderResponse() {
        return new GetStudentsByGenderResponse();
    }

    /**
     * Create an instance of {@link GetStudentsByFirstNameResponse }
     */
    public GetStudentsByFirstNameResponse createGetStudentsByFirstNameResponse() {
        return new GetStudentsByFirstNameResponse();
    }

    /**
     * Create an instance of {@link GetStudentsByEmailResponse }
     */
    public GetStudentsByEmailResponse createGetStudentsByEmailResponse() {
        return new GetStudentsByEmailResponse();
    }

    /**
     * Create an instance of {@link GetAllStudentsResponse }
     */
    public GetAllStudentsResponse createGetAllStudentsResponse() {
        return new GetAllStudentsResponse();
    }

    /**
     * Create an instance of {@link AddStudent }
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link DeleteAllStudents }
     */
    public DeleteAllStudents createDeleteAllStudents() {
        return new DeleteAllStudents();
    }

    /**
     * Create an instance of {@link DeleteAllStudentsResponse }
     */
    public DeleteAllStudentsResponse createDeleteAllStudentsResponse() {
        return new DeleteAllStudentsResponse();
    }

    /**
     * Create an instance of {@link DeleteStudentById }
     */
    public DeleteStudentById createDeleteStudentById() {
        return new DeleteStudentById();
    }

    /**
     * Create an instance of {@link DeleteStudentByIdResponse }
     */
    public DeleteStudentByIdResponse createDeleteStudentByIdResponse() {
        return new DeleteStudentByIdResponse();
    }

    /**
     * Create an instance of {@link DownloadStudentAvatar }
     */
    public DownloadStudentAvatar createDownloadStudentAvatar() {
        return new DownloadStudentAvatar();
    }

    /**
     * Create an instance of {@link DownloadStudentAvatarAsBase64 }
     */
    public DownloadStudentAvatarAsBase64 createDownloadStudentAvatarAsBase64() {
        return new DownloadStudentAvatarAsBase64();
    }

    /**
     * Create an instance of {@link DownloadStudentAvatarAsBase64Response }
     */
    public DownloadStudentAvatarAsBase64Response createDownloadStudentAvatarAsBase64Response() {
        return new DownloadStudentAvatarAsBase64Response();
    }

    /**
     * Create an instance of {@link DownloadStudentAvatarResponse }
     */
    public DownloadStudentAvatarResponse createDownloadStudentAvatarResponse() {
        return new DownloadStudentAvatarResponse();
    }

    /**
     * Create an instance of {@link GetAllStudents }
     */
    public GetAllStudents createGetAllStudents() {
        return new GetAllStudents();
    }

    /**
     * Create an instance of {@link GetStudentById }
     */
    public GetStudentById createGetStudentById() {
        return new GetStudentById();
    }

    /**
     * Create an instance of {@link GetStudentByIdResponse }
     */
    public GetStudentByIdResponse createGetStudentByIdResponse() {
        return new GetStudentByIdResponse();
    }

    /**
     * Create an instance of {@link GetStudentsByEmail }
     */
    public GetStudentsByEmail createGetStudentsByEmail() {
        return new GetStudentsByEmail();
    }

    /**
     * Create an instance of {@link GetStudentsByFirstName }
     */
    public GetStudentsByFirstName createGetStudentsByFirstName() {
        return new GetStudentsByFirstName();
    }

    /**
     * Create an instance of {@link GetStudentsByGender }
     */
    public GetStudentsByGender createGetStudentsByGender() {
        return new GetStudentsByGender();
    }

    /**
     * Create an instance of {@link GetStudentsByLastName }
     */
    public GetStudentsByLastName createGetStudentsByLastName() {
        return new GetStudentsByLastName();
    }

    /**
     * Create an instance of {@link Hello }
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link UpdateStudent }
     */
    public UpdateStudent createUpdateStudent() {
        return new UpdateStudent();
    }

    /**
     * Create an instance of {@link UpdateStudentResponse }
     */
    public UpdateStudentResponse createUpdateStudentResponse() {
        return new UpdateStudentResponse();
    }

    /**
     * Create an instance of {@link UploadBase64ImageToStudent }
     */
    public UploadBase64ImageToStudent createUploadBase64ImageToStudent() {
        return new UploadBase64ImageToStudent();
    }

    /**
     * Create an instance of {@link UploadBase64ImageToStudentResponse }
     */
    public UploadBase64ImageToStudentResponse createUploadBase64ImageToStudentResponse() {
        return new UploadBase64ImageToStudentResponse();
    }

    /**
     * Create an instance of {@link IOException }
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link StudentEntity }
     */
    public StudentEntity createStudentEntity() {
        return new StudentEntity();
    }

    /**
     * Create an instance of {@link GetStudentsByLastNameResponse.Students }
     */
    public GetStudentsByLastNameResponse.Students createGetStudentsByLastNameResponseStudents() {
        return new GetStudentsByLastNameResponse.Students();
    }

    /**
     * Create an instance of {@link GetStudentsByGenderResponse.Students }
     */
    public GetStudentsByGenderResponse.Students createGetStudentsByGenderResponseStudents() {
        return new GetStudentsByGenderResponse.Students();
    }

    /**
     * Create an instance of {@link GetStudentsByFirstNameResponse.Students }
     */
    public GetStudentsByFirstNameResponse.Students createGetStudentsByFirstNameResponseStudents() {
        return new GetStudentsByFirstNameResponse.Students();
    }

    /**
     * Create an instance of {@link GetStudentsByEmailResponse.Students }
     */
    public GetStudentsByEmailResponse.Students createGetStudentsByEmailResponseStudents() {
        return new GetStudentsByEmailResponse.Students();
    }

    /**
     * Create an instance of {@link GetAllStudentsResponse.Students }
     */
    public GetAllStudentsResponse.Students createGetAllStudentsResponseStudents() {
        return new GetAllStudentsResponse.Students();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllStudents }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteAllStudents }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "deleteAllStudents")
    public JAXBElement<DeleteAllStudents> createDeleteAllStudents(DeleteAllStudents value) {
        return new JAXBElement<DeleteAllStudents>(_DeleteAllStudents_QNAME, DeleteAllStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllStudentsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteAllStudentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "deleteAllStudentsResponse")
    public JAXBElement<DeleteAllStudentsResponse> createDeleteAllStudentsResponse(DeleteAllStudentsResponse value) {
        return new JAXBElement<DeleteAllStudentsResponse>(_DeleteAllStudentsResponse_QNAME, DeleteAllStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentById }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteStudentById }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "deleteStudentById")
    public JAXBElement<DeleteStudentById> createDeleteStudentById(DeleteStudentById value) {
        return new JAXBElement<DeleteStudentById>(_DeleteStudentById_QNAME, DeleteStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentByIdResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteStudentByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "deleteStudentByIdResponse")
    public JAXBElement<DeleteStudentByIdResponse> createDeleteStudentByIdResponse(DeleteStudentByIdResponse value) {
        return new JAXBElement<DeleteStudentByIdResponse>(_DeleteStudentByIdResponse_QNAME, DeleteStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadStudentAvatar }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DownloadStudentAvatar }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "downloadStudentAvatar")
    public JAXBElement<DownloadStudentAvatar> createDownloadStudentAvatar(DownloadStudentAvatar value) {
        return new JAXBElement<DownloadStudentAvatar>(_DownloadStudentAvatar_QNAME, DownloadStudentAvatar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadStudentAvatarAsBase64 }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DownloadStudentAvatarAsBase64 }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "downloadStudentAvatarAsBase64")
    public JAXBElement<DownloadStudentAvatarAsBase64> createDownloadStudentAvatarAsBase64(DownloadStudentAvatarAsBase64 value) {
        return new JAXBElement<DownloadStudentAvatarAsBase64>(_DownloadStudentAvatarAsBase64_QNAME, DownloadStudentAvatarAsBase64.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadStudentAvatarAsBase64Response }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DownloadStudentAvatarAsBase64Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "downloadStudentAvatarAsBase64Response")
    public JAXBElement<DownloadStudentAvatarAsBase64Response> createDownloadStudentAvatarAsBase64Response(DownloadStudentAvatarAsBase64Response value) {
        return new JAXBElement<DownloadStudentAvatarAsBase64Response>(_DownloadStudentAvatarAsBase64Response_QNAME, DownloadStudentAvatarAsBase64Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadStudentAvatarResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DownloadStudentAvatarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "downloadStudentAvatarResponse")
    public JAXBElement<DownloadStudentAvatarResponse> createDownloadStudentAvatarResponse(DownloadStudentAvatarResponse value) {
        return new JAXBElement<DownloadStudentAvatarResponse>(_DownloadStudentAvatarResponse_QNAME, DownloadStudentAvatarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudents }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAllStudents }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "getAllStudents")
    public JAXBElement<GetAllStudents> createGetAllStudents(GetAllStudents value) {
        return new JAXBElement<GetAllStudents>(_GetAllStudents_QNAME, GetAllStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAllStudentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "getAllStudentsResponse")
    public JAXBElement<GetAllStudentsResponse> createGetAllStudentsResponse(GetAllStudentsResponse value) {
        return new JAXBElement<GetAllStudentsResponse>(_GetAllStudentsResponse_QNAME, GetAllStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentById }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetStudentById }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "getStudentById")
    public JAXBElement<GetStudentById> createGetStudentById(GetStudentById value) {
        return new JAXBElement<GetStudentById>(_GetStudentById_QNAME, GetStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByIdResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetStudentByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "getStudentByIdResponse")
    public JAXBElement<GetStudentByIdResponse> createGetStudentByIdResponse(GetStudentByIdResponse value) {
        return new JAXBElement<GetStudentByIdResponse>(_GetStudentByIdResponse_QNAME, GetStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByEmail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetStudentsByEmail }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "getStudentsByEmail")
    public JAXBElement<GetStudentsByEmail> createGetStudentsByEmail(GetStudentsByEmail value) {
        return new JAXBElement<GetStudentsByEmail>(_GetStudentsByEmail_QNAME, GetStudentsByEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByEmailResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetStudentsByEmailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "getStudentsByEmailResponse")
    public JAXBElement<GetStudentsByEmailResponse> createGetStudentsByEmailResponse(GetStudentsByEmailResponse value) {
        return new JAXBElement<GetStudentsByEmailResponse>(_GetStudentsByEmailResponse_QNAME, GetStudentsByEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByFirstName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetStudentsByFirstName }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "getStudentsByFirstName")
    public JAXBElement<GetStudentsByFirstName> createGetStudentsByFirstName(GetStudentsByFirstName value) {
        return new JAXBElement<GetStudentsByFirstName>(_GetStudentsByFirstName_QNAME, GetStudentsByFirstName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByFirstNameResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetStudentsByFirstNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "getStudentsByFirstNameResponse")
    public JAXBElement<GetStudentsByFirstNameResponse> createGetStudentsByFirstNameResponse(GetStudentsByFirstNameResponse value) {
        return new JAXBElement<GetStudentsByFirstNameResponse>(_GetStudentsByFirstNameResponse_QNAME, GetStudentsByFirstNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByGender }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetStudentsByGender }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "getStudentsByGender")
    public JAXBElement<GetStudentsByGender> createGetStudentsByGender(GetStudentsByGender value) {
        return new JAXBElement<GetStudentsByGender>(_GetStudentsByGender_QNAME, GetStudentsByGender.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByGenderResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetStudentsByGenderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "getStudentsByGenderResponse")
    public JAXBElement<GetStudentsByGenderResponse> createGetStudentsByGenderResponse(GetStudentsByGenderResponse value) {
        return new JAXBElement<GetStudentsByGenderResponse>(_GetStudentsByGenderResponse_QNAME, GetStudentsByGenderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByLastName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetStudentsByLastName }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "getStudentsByLastName")
    public JAXBElement<GetStudentsByLastName> createGetStudentsByLastName(GetStudentsByLastName value) {
        return new JAXBElement<GetStudentsByLastName>(_GetStudentsByLastName_QNAME, GetStudentsByLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByLastNameResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetStudentsByLastNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "getStudentsByLastNameResponse")
    public JAXBElement<GetStudentsByLastNameResponse> createGetStudentsByLastNameResponse(GetStudentsByLastNameResponse value) {
        return new JAXBElement<GetStudentsByLastNameResponse>(_GetStudentsByLastNameResponse_QNAME, GetStudentsByLastNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudent }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UpdateStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "updateStudent")
    public JAXBElement<UpdateStudent> createUpdateStudent(UpdateStudent value) {
        return new JAXBElement<UpdateStudent>(_UpdateStudent_QNAME, UpdateStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UpdateStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "updateStudentResponse")
    public JAXBElement<UpdateStudentResponse> createUpdateStudentResponse(UpdateStudentResponse value) {
        return new JAXBElement<UpdateStudentResponse>(_UpdateStudentResponse_QNAME, UpdateStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadBase64ImageToStudent }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UploadBase64ImageToStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "uploadBase64ImageToStudent")
    public JAXBElement<UploadBase64ImageToStudent> createUploadBase64ImageToStudent(UploadBase64ImageToStudent value) {
        return new JAXBElement<UploadBase64ImageToStudent>(_UploadBase64ImageToStudent_QNAME, UploadBase64ImageToStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadBase64ImageToStudentResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UploadBase64ImageToStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "uploadBase64ImageToStudentResponse")
    public JAXBElement<UploadBase64ImageToStudentResponse> createUploadBase64ImageToStudentResponse(UploadBase64ImageToStudentResponse value) {
        return new JAXBElement<UploadBase64ImageToStudentResponse>(_UploadBase64ImageToStudentResponse_QNAME, UploadBase64ImageToStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.soa.com/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

}
