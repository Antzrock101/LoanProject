package com.loanintegrity.academy.dao;

import com.loanintegrity.academy.datafeed.LoanData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface LoanDataRepository extends JpaRepository<LoanData,Integer>  {

Collection<LoanData> findByLoanNumber(Integer ln);


}
