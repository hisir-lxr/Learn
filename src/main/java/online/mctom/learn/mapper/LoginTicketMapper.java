package online.mctom.learn.mapper;

import online.mctom.learn.entity.LoginTicket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author hisir
* @description 针对表【login_tickets(登录凭证表)】的数据库操作Mapper
* @createDate 2023-07-09 18:41:58
* @Entity online.mctom.learn.entity.LoginTicket
*/

@Mapper
public interface LoginTicketMapper {

    void insertLoginTicket(LoginTicket loginTicket);

    LoginTicket selectByTicket(@Param("ticket") String ticket);
}




