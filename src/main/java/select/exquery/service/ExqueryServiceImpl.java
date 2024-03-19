package select.exquery.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import select.exquery.dao.ExqueryDao;

@Service(value = "exqueryService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ExqueryServiceImpl implements ExqueryService {

    @Inject
    @Named("exqueryDao")
    private ExqueryDao exqueryDao;

    Logger log = LoggerFactory.getLogger(this.getClass());


    public HashMap<String, Object> selectOne(String id, Object param) {
        return exqueryDao.selectOne(id, param);
    }


    public List<HashMap<String,Object>> selectList(String id, Object param) {
        return exqueryDao.selectList(id, param);
    }

    @Transactional(propagation = Propagation.REQUIRED , readOnly = false)
    public int insert(String id, Object param) {
        return exqueryDao.insert(id, param);
    }

    @Transactional(propagation = Propagation.REQUIRED , readOnly = false)
    public int update(String id, Object param) {
        return exqueryDao.update(id, param);
    }

    @Transactional(propagation = Propagation.REQUIRED , readOnly = false)
    public int delete(String id, Object param) {
        return exqueryDao.delete(id, param);
    }
}
