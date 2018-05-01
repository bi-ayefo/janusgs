package com.gt.gestionsoi.repository;

import com.gt.gestionsoi.entity.Processus;

import java.util.Optional;

/**
 * Le repository de l'entité Processus
 *
 * @author <a href="mailto:claude-rodrigue.affodogandji@ace3i.com?">RODRIGUE
 * AFFODOGANDJI</a>
 * @version 1.0
 * @since 23/06/2017
 */
public interface ProcessusRepository extends BaseEntityRepository<Processus, Integer> {
    Optional<Processus> findByLibelle(String libelle);
}
