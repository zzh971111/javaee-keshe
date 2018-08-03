package org.keshe.infosys.dao.impl;
import java.util.List;
import org.keshe.infosys.dao.*;
import org.keshe.infosys.vo.Stuinfo;
import org.hibernate.*;
public class stuloginDAO extends BaseDAO implements IstuloginDAO {
	public Stuinfo validateStuinfo(String stuid,String studpwd){
		String sql="from Stuinfo s where s.stuid=? and s.studpwd=?";
		Session session=getSession();
		Query query=session.createQuery(sql);
		query.setParameter(0, stuid);
		query.setParameter(1, studpwd);
		List stu=query.list();
		if(stu.size()!=0)
		{
			Stuinfo stuinfo=(Stuinfo)stu.get(0);
			session.close();
			return stuinfo;
		}else{
		session.close();
		return null;}
	}

}
