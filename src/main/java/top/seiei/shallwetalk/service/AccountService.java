package top.seiei.shallwetalk.service;

import top.seiei.shallwetalk.bean.TestObj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/account")
public class AccountService {

    /**
     * 像使用 @ReponseBody 一样
     * 需要使用 @Consumes 和 @Produces 来表明接受及发送的数据格式是 JSON
     * @return
     */
    @GET
    @Path("/getTestObj")
    @Produces(MediaType.APPLICATION_JSON)
    public TestObj getTestObj(String txt) {
        TestObj obj = new TestObj();
        obj.setTxt(txt);
        return obj;
    }

}
