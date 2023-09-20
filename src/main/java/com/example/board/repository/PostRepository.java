package com.example.board.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
/**
 * 投稿のリポジトリー.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	/**
	    * IDで検索する
	    *
	    * @param id ID
	    * @return 投稿
	    */
	    public Optional<Post> findById(String id);}
