package com.studantmongodb.service;

import java.util.List;

import com.studantmongodb.model.StudentRequest;
import com.studantmongodb.model.StudentResponse;

public interface StudentService {

    StudentResponse create(StudentRequest request);

    List<StudentResponse> getAll();

    StudentResponse update(String id, StudentRequest request);

    void delete(String id);
}


/*
 * A classe StudentService é uma interface que define um contrato para as operações relacionadas a estudantes em seu aplicativo. Ela geralmente atua como uma camada de serviço, encapsulando a lógica de negócios associada às operações de criação e leitura de estudantes. Vamos analisar os métodos declarados nessa interface:

create (criar):

Propósito: Este método é responsável por criar um novo estudante com base nos dados fornecidos na solicitação (StudentRequest).
Entrada: Um objeto StudentRequest contendo os dados necessários para criar um estudante.
Saída: Um objeto StudentResponse que representa o estudante recém-criado. Pode incluir informações adicionais, como um identificador (id), que pode ter sido gerado durante a criação e/ou processamento da solicitação.
getAll (obter todos):

Propósito: Este método é responsável por recuperar todos os estudantes existentes no sistema.
Saída: Uma lista de objetos StudentResponse, representando todos os estudantes no sistema. Cada objeto pode incluir informações relevantes para a resposta, como o identificador (id) e outros detalhes do estudante.
A principal finalidade dessa interface é definir um contrato para as operações relacionadas aos estudantes, separando a lógica de negócios da implementação detalhada. A implementação concreta dessa interface seria realizada em uma classe que fornece a lógica real para a criação e leitura de estudantes. Além disso, a separação da interface permite a injeção de dependências, facilitando testes unitários e tornando o código mais modular e flexível.






create(StudentRequest request): Para criar um estudante com base nos dados fornecidos em StudentRequest e retornar os dados do estudante criado em StudentResponse.
getAll(): Para obter uma lista de todos os estudantes, retornando os dados em forma de uma lista de StudentResponse.
 */