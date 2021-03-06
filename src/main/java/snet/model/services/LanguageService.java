package snet.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import snet.model.entities.Language;
import snet.model.repositories.LanguageRepository;

@Service
public class LanguageService {

	@Autowired
	private LanguageRepository repo;

	public Language findById(String id) {
		return repo.findById(id);
	}

	public List<Language> listAllActive() {
		return repo.listAllActive();
	}
}
