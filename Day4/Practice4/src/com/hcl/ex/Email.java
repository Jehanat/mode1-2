package com.hcl.ex;


public class Email {
  String emailId = "jehanatjamil@gmail.com";
  /**
   * Method for business logic.
   * @param emailId is used as parameter.
   * @throws InvalidEmailException in the described method.
   * @throws InvalidUserNameException in the described method.
   */

  public void setEmailId(String emailId) throws InvalidEmailException, InvalidUserNameException{
    boolean flag = true;
    if (emailId.indexOf("@") == -1) { 
      flag = false;
      throw new InvalidEmailException("Doesn't contain @");
    }
    if (emailId.indexOf("@") > 12) {
      flag = false;
      throw new InvalidUserNameException("Invalide username");
    }
    if (flag == true) {
      System.out.println("Email" + emailId);
    }
  }
  /**
   * Method for business logic.
   * @param args is EmailId.
   */
  
  public static void main(String[] args) {
    String emailId = "jehanat.jamil@gmail.com";
    try {
      new Email().setEmailId(emailId);
    } catch  (InvalidEmailException | InvalidUserNameException e){
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}


