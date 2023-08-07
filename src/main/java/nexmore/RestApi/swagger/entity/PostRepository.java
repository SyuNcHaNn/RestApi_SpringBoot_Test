package nexmore.RestApi.swagger.entity;

import nexmore.RestApi.swagger.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long>{

}