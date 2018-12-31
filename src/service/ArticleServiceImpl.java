package service;

import java.util.ArrayList;

import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService{

	@Override
	public void joinArticle(String seq, String title, String content, String writer, String regdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ArticleBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArticleBean> findByWriter(String writer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleBean findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countTitle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existTitle(String title, String writer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String regdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTitle(String title, String writer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTitle(String title, String writer) {
		// TODO Auto-generated method stub
		
	}

}
