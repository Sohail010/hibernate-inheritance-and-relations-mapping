package com.hibernate.associations.xml.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.RegisterHibernate;

public class OneToMany {
	public static void main(String[] args) {
		RegisterHibernate.register();
		Session session = RegisterHibernate.getSession();
		Transaction transaction = RegisterHibernate.getTransaction();

		try {
			Question question = new Question();
			question.setQuestion("what is hibernate");
			// question.setQuestionID(101);

			Answers answers = new Answers();
			answers.setAnswers("hibernate is ORM");
			//answers.setAnswerID(201);

			Answers answers2 = new Answers();
			answers2.setAnswers("hibernate is a framework");
			//answers2.setAnswerID(202);
			List<Answers> listOfAnswers = new ArrayList<Answers>();
			listOfAnswers.add(answers);
			listOfAnswers.add(answers2);
			question.setAnswers(listOfAnswers);

			session.persist(question);
			session.persist(answers);
			session.persist(answers2);
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();

		} finally {
			transaction.commit();
			session.close();

		}

	}

}
