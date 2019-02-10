package com.project.demo.service;

import java.util.*;

import com.project.demo.model.*;

public interface PibService {
void insert(int pibId, int year, double percent);
List<Pib> getAllPibs();
void delete(int pibId);
}
