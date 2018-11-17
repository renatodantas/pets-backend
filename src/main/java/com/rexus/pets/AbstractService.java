package com.rexus.pets;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractService<T, ID> implements JpaRepository<T, ID> {
	
	@Override
	public long count() {
		return getRepository().count();
	}
	
	@Override
	public <S extends T> long count(Example<S> example) {
		return getRepository().count(example);
	}

	@Override
	public void delete(T entity) {
		getRepository().delete(entity);
	}

	@Override
	public void deleteAll() {
		getRepository().deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends T> entities) {
		getRepository().deleteAll(entities);
	}

	@Override
	public void deleteAllInBatch() {
		getRepository().deleteAllInBatch();
	}

	@Override
	public void deleteById(ID id) {
		getRepository().deleteById(id);
	}

	@Override
	public void deleteInBatch(Iterable<T> entities) {
		getRepository().deleteInBatch(entities);
	}

	@Override
	public <S extends T> boolean exists(Example<S> example) {
		return getRepository().exists(example);
	}

	@Override
	public boolean existsById(ID id) {
		return existsById(id);
	}

	@Override
	public List<T> findAll() {
		return getRepository().findAll();
	}

	@Override
	public <S extends T> List<S> findAll(Example<S> example) {
		return getRepository().findAll(example);
	}

	@Override
	public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
		return getRepository().findAll(example, pageable);
	}

	@Override
	public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
		return getRepository().findAll(example, sort);
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		return getRepository().findAll(pageable);
	}

	@Override
	public List<T> findAll(Sort sort) {
		return getRepository().findAll(sort);
	}

	@Override
	public List<T> findAllById(Iterable<ID> ids) {
		return getRepository().findAllById(ids);
	}

	@Override
	public Optional<T> findById(ID id) {
		return findById(id);
	}

	@Override
	public <S extends T> Optional<S> findOne(Example<S> example) {
		return getRepository().findOne(example);
	}

	@Override
	public void flush() {
		getRepository().flush();
	}

	@Override
	public T getOne(ID id) {
		return getRepository().getOne(id);
	}

	protected abstract JpaRepository<T, ID> getRepository();

	@Override
	public <S extends T> S save(S entity) {
		return getRepository().save(entity);
	}

	@Override
	public <S extends T> List<S> saveAll(Iterable<S> entities) {
		return getRepository().saveAll(entities);
	}

	@Override
	public <S extends T> S saveAndFlush(S entity) {
		return getRepository().saveAndFlush(entity);
	}

}
