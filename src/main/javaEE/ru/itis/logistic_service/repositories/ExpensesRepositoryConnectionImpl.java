package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Expense;
import ru.itis.logistic_service.models.Truck;

import java.util.List;
import java.util.Optional;

public class ExpensesRepositoryConnectionImpl implements ExpensesRepository {

    @Override
    public List<Expense> findAllByExpenseItem(String expenseItem) {
        return null;
    }

    @Override
    public Truck findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Expense model) {

    }

    @Override
    public void update(Expense model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Expense> findAll() {
        return null;
    }
}
