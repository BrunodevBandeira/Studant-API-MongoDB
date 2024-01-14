package  com.studantmongodb.model;

import java.time.LocalDate;


public class StudentRequest {
    // StudentRequest 
    // é usado quando você está enviando dados para criar ou atualizar um estudante.
    
    private String name;
    private LocalDate birthDate;
    private String document;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }


}
