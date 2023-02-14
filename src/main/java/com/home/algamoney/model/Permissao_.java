package com.home.algamoney.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Permissao.class)
public abstract class Permissao_ {

	public static volatile SingularAttribute<Permissao, Long> codigo;
	public static volatile SingularAttribute<Permissao, String> descricao;

	public static final String CODIGO = "codigo";
	public static final String DESCRICAO = "descricao";

}

