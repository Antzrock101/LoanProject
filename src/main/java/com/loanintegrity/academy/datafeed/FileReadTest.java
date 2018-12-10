package com.loanintegrity.academy.datafeed;

import java.util.ArrayList;
import java.util.List;



public class FileReadTest {

   public static void main(String[] args) {

      List<LoanData> loanDataList = new ArrayList<>();

      FileRead fileRead = new FileRead();

      String inputFileName = "C:\\LoanProject\\documents\\TestData.txt";

      loanDataList = fileRead.processFile(inputFileName);

      for (LoanData c: loanDataList) {
         System.out.println(c);
      }
   }

}
