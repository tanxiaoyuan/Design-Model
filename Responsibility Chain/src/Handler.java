public abstract class Handler {
    private Handler nextHandler;
    public final Response handleMessage(Request request){
        Response response = null;
        if(this.getHandlerLevel().equals(request.getLevel())){
            response = this.echo();
        }else{
            if(this.nextHandler != null){
                response =  this.nextHandler.handleMessage(request);
            }else{
                System.out.println("No next handler...");
            }
        }
        return response;
    }
    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
    protected abstract Level getHandlerLevel();
    protected abstract Response echo();
}
