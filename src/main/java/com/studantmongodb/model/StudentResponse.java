package  com.studantmongodb.model;

import java.time.LocalDate;

public class StudentResponse {
    // StudentResponse 
    // é usado quando você quer representar os dados de um estudante em resposta a uma consulta ou operação.

    private String id;
    private String name;
    private LocalDate birthDate;
    private String document;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
