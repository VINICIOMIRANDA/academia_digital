package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MatriculaRepository extends JpaRepository <Matricula, Long>{

  //  @Query(value = "SELECT * FROM tb_matriculas m " +
    //        "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
    //        "WHERE a.bairro = :bairro", nativeQuery = true)
     //@Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
 //   List<Matricula> findByAlunoMatriculadosDosBairro(String Bairro);


    List<Matricula> findByAlunoBairro(String Bairro);
}
