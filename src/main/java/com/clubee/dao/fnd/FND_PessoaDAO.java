package com.clubee.dao.fnd;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.fnd.FND_PessoaVO;
import com.clubee.util.jpa.Transactional;

public class FND_PessoaDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager; 
	
	public FND_PessoaVO porId(Integer id) {
		return manager.find(FND_PessoaVO.class, id);
	}
	
	private FND_PessoaVO porEmail(String email) {
		return manager.createQuery("select p from FND_PessoaVO p where p.emailLogin = :email", FND_PessoaVO.class)
				.setParameter("email", email)
				.getSingleResult();
	}
	
	@Transactional
	public void inserirPessoaVO(FND_PessoaVO pessoa) {
		manager.merge(pessoa);
	}
	
	public List<FND_PessoaVO> buscarTodosUsuarios() {
		return manager.createQuery("from FND_PessoasVO", FND_PessoaVO.class).getResultList();
	}
	
	public boolean verificarSenha(String email, String senha) {
		if((email != null && !email.equals("")) || (senha != null && !senha.equals("")) ) {
		
			FND_PessoaVO usuario = porEmail(email);
			
			if(usuario != null) {
				if(usuario.getEmail().equals(email) && usuario.getPassword().equals(senha)) {
					return true;
				}
			}
		}
		
		return false;
	}
}
