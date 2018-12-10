package com.loanintegrity.academy.datafeed;



import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FileRead {



   public List<LoanData> processFile(String fileName) {



      try (

              InputStream inputFS = new FileInputStream(fileName);

              BufferedReader br = new BufferedReader(new InputStreamReader(inputFS))) {
         List<LoanData> loanDataList;

         loanDataList =   br.lines()
                           .skip(1)
                           .map(createLoan)
                           .collect(Collectors.toList());

         return loanDataList;
      } catch (IOException e) {
         e.printStackTrace();
      }

      return null;
   }

   private Function<String, LoanData> createLoan = (line) -> {

      String[] p = line.split("\\|");

      //System.out.println(Arrays.toString(p));

      LoanData loanData = new LoanData();
      loanData.setLoanNumber(p[0]);
      loanData.setStatus(p[1]);
      loanData.setCustomerName(p[2]);
      loanData.setCreateDate(dateFormat(p[3]));
      loanData.setOriginDate(dateFormat(p[4]));
      loanData.setUpdtDate(dateFormat(p[5]));
      loanData.setDeptName(p[6]);
      loanData.setDeptId(p[7]);

     return loanData;
   };

   public static LocalDate dateFormat(String input) {

      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      Date formattedDate = null;
      try {
         formattedDate = dateFormat.parse(input);
      } catch (ParseException e) {
         e.printStackTrace();
      }

      Instant instant = formattedDate.toInstant();
      ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
      LocalDate returnDate = zdt.toLocalDate();

      return returnDate;
   }

}
