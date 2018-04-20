package postmanager.model.service.repository;

import org.springframework.data.mybatis.repository.support.MybatisRepository;
import postmanager.model.entities.Content;
import postmanager.model.entities.User;

public interface ContentRepository extends MybatisRepository<Content, Long> {
    Content findByHash(String hash);
}
