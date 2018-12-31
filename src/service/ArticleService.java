package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {
	public void joinArticle(String seq,String title,String content,String writer,String regdate);
	public ArrayList<ArticleBean> list();
	public ArrayList<ArticleBean> findByWriter(String writer);
	public ArticleBean findByTitle(String title);
	public int countTitle();
	public boolean existTitle(String title,String writer);
	public String regdate();
	public void updateTitle(String title,String writer);
	public void deleteTitle(String title,String writer);
}
