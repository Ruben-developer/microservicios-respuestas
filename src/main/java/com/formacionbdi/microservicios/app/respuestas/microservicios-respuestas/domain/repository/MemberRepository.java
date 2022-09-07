package com.formacionbdi.microservicios.app.respuestas.microservicios-respuestas.domain.repository;

import com.formacionbdi.microservicios.app.respuestas.microservicios-respuestas.domain.entity.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {

    Member findByUsername(String username);

    Optional<Member> findByToken(String token);
}
