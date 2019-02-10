package com.project.demo.dao;
import java.util.List;

import com.project.demo.model.*;


public interface PibDao {
void insert(int pibId, int year, double percent);
List<Pib> getAllPibs();
void delete(int pibId);
}
