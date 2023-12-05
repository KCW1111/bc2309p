public class BusinessException extends Exception { // checked exception

  private int code;
  private String errMsg;

  // public BusinessException(){

  // }

  // public BusinessException(String message){
  //   super(message);
  // }

  public BusinessException(ErrCode errCode){
    super(errCode.getErrMsg());
    this.code = errCode.getCode();
  }

  public int getCode(){
    return this.code;
  }

  // public String getErrMsg(){
  //   return this.errMsg;
  //  }

  public String getErrMC(){
    return super.getMessage() + this.getCode();
    //return String.valueOf(this.code).concat(" - ").concat(super.getMessage());
   }
  
}
