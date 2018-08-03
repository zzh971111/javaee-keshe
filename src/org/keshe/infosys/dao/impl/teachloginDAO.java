package org.keshe.infosys.dao.impl;
import java.util.List;
import org.keshe.infosys.dao.*;
import org.keshe.infosys.vo.Teachinfo;
import org.hibernate.*;

public  class teachloginDAO extends BaseDAO implements IteachloginDAO {
	public Teachinfo validateTeachinfo(String teachid,String teachpwd){
		String sql="from Teachinfo t where t.teachid=? and t.teachpwd=?";
		Session session=getSession();
		Query query=session.createQuery(sql);
		query.setParameter(0, teachid);
		query.setParameter(1, teachpwd);
		List teacher=query.list();
		if(teacher.size()!=0)
		{
			Teachinfo teachinfo=(Teachinfo)teacher.get(0);
			session.close();
			return teachinfo;
		}else{
		session.close();
		return null;}
	}

	

}
