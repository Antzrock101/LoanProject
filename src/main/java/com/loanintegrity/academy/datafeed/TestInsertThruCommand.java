package com.loanintegrity.academy.datafeed;

import com.loanintegrity.academy.dao.LoanDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class TestInsertThruCommand implements CommandLineRunner {

   @Autowired
   private LoanDataRepository loanDataRepository;

   @Override
   public void run(String... args) throws Exception {
      List<LoanData> loanDataList = new ArrayList<>();

      FileRead fileRead = new FileRead();

      String inputFileName = "C:\\LoanProject\\documents\\TestData.txt";

      loanDataList = fileRead.processFile(inputFileName);

      for (LoanData c: loanDataList) {
         loanDataRepository.save(c);
      }
   }
}
