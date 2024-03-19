package select.exquery.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository("exqueryDao")
public class ExqueryDaoImpl extends SqlSessionDaoSupport implements ExqueryDao {

    @Inject
    public void setMySqlSessionFactory(@Named("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    Logger log = LoggerFactory.getLogger(this.getClass());

    public HashMap<String, Object> selectOne(String id, Object param) {
        return getSqlSession().selectOne(id, param);
    }


    public List<HashMap<String, Object>> selectList(String id, Object param) {
        return getSqlSession().selectList(id, param);

    }

    public int insert(String id, Object param) {
        return getSqlSession().insert(id, param);
    }

    // UPDATE
    public int update(String id, Object param) {
        return getSqlSession().update(id, param);
    }

    // DELETE
    public int delete(String id, Object param) {
        return getSqlSession().delete(id, param);
    }

}
