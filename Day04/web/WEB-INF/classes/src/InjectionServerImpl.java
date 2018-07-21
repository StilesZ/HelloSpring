public class InjectionServerImpl implements InjectionServer {

    protected InjectionDAO injectionDAO;


    //构造
    public  InjectionServerImpl(InjectionDAO injectionDAO){
        this.injectionDAO = injectionDAO;
    }

    //设值
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public void save(String arg){
        System.out.println( "server:"+arg);
        arg=arg+":"+this.hashCode();
        injectionDAO.save(arg);
    }
}
