package com.hibernate.associations.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.util.RegisterHibernate;

public class OneToOne {

	public static void main(String[] args) {

		RegisterHibernate.register();
		Session session = RegisterHibernate.getSession();
		Transaction transaction = RegisterHibernate.getTransaction();

		Question question = new Question();
		question.setQuestion("What is java");
		question.setQuestionID(101);

		Answer answer = new Answer();
		answer.setAnswerID(201);
		answer.setAnswer("Java is a programming language");
		question.setAnswer(answer);
		answer.setQuestion(question);

		session.persist(question);
		session.persist(answer);
		transaction.commit();
		session.close();

	}

}
