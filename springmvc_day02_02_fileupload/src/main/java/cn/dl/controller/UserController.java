package cn.dl.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping(value = "/userController")
public class UserController {

    /**
     * 文件上传
     */
    @RequestMapping(value = "/fileUploadTest")
    public String fileUploadTest(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("SpringMVC文件上传...");

        //设置上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断该路径是否存在
        File file = new File(path);
        if (!file.exists()){
            //如果不存在，创建该路径
            file.mkdirs();
        }

        //说明上传文件项
        //设置上传文件的名称
        String filename = upload.getOriginalFilename();
        //把文件名称设置成唯一值
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + filename;
        //完成文件上传
        upload.transferTo(new File(path, filename));
        return "success";
    }

    @RequestMapping(value = "/fileUploadTest2")
    public String fileUploadTest2(){
        System.out.println("test...");
        return "success";
    }

    /**
     * 跨服务器文件上传
     */
    @RequestMapping(value = "/fileUploadTest3")
    public String fileUploadTest3(MultipartFile upload) throws Exception {
        System.out.println("跨服务器文件上传...");

        //定义上传服务器的路径位置
        String path = "http://localhost:9090/uploads/";

        //说明上传文件项
        //设置上传文件的名称
        String filename = upload.getOriginalFilename();
        //把文件名称设置成唯一值
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + filename;

        //创建客户端对象
        Client client = Client.create();

        //和图片服务器进行连接
        WebResource webResource = client.resource(path+filename);

        //上传文件
        webResource.put(upload.getBytes());

        return "success";
    }
}
