package kr.co.dmtlabs.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.dmtlabs.platform.domain.Job_Result;

@Repository
public interface Job_ResultRepository extends JpaRepository<Job_Result, String> {

}
