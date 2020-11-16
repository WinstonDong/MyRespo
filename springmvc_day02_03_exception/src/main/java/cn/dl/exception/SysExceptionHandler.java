package cn.dl.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//异常处理器
public class SysExceptionHandler implements HandlerExceptionResolver {

    /**
     *处理异常的业务逻辑
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        SysException exception = null;
        if (e instanceof SysException){
            exception = (SysException)e;
        }else {
            exception = new SysException("系统正在维护中");
        }

        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        mv.addObject("errormsg", exception.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
