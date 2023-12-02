public class BusinessException extends Exception { // checked exception

  private int code;

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
  
}
