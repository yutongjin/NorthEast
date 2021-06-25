demo(st) ::= <<
import model.NeResponse;
class Ne{
public NeResponse print(){
    System.out.println("print statement");
    System.out.println("<st.PrintContent>");
    NeResponse response = new NeResponse();
    response.setPrintInfo("<st.PrintContent>");
    return response;
}
}
>>