package org.atlanmod.ocl;

import java.util.List;

public class AbstractCollection<E> implements Collection<E> {

    private List<E> elements;

    @Override
    public boolean equals(Collection<E> other) {
        return false;
    }

    @Override
    public boolean unequals(Collection other) {
        return false;
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean includes(Object elm) {
        return false;
    }

    @Override
    public boolean excludes(Object elm) {
        return false;
    }

    @Override
    public int count(Object elm) {
        return 0;
    }

    @Override
    public boolean includesAll(Collection c2) {
        return false;
    }

    @Override
    public boolean excludesAll(Collection other) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean notEmpty() {
        return false;
    }

    @Override
    public E max() {
        return null;
    }

    @Override
    public E min() {
        return null;
    }

    @Override
    public E sum() {
        return null;
    }

    @Override
    public Set product(Collection other) {
        return null;
    }

    @Override
    public Set asSet() {
        return null;
    }

    @Override
    public OrderedSet asOrderedSet() {
        return null;
    }

    @Override
    public Sequence asSequence() {
        return null;
    }

    @Override
    public Bag asBag() {
        return null;
    }

    @Override
    public void flatten() {

    }

    @Override
    public Collection select(Expression exp) {
        return null;
    }

    @Override
    public Collection including(Object element) {
        return null;
    }

    @Override
    public Collection excluding(Object element) {
        return null;
    }

    @Override
    public Collection reject(Expression exp) {
        return null;
    }

    @Override
    public Collection collect(Expression exp) {
        return null;
    }

    @Override
    public boolean forAll(Expression exp) {
        return false;
    }

    @Override
    public boolean exists(Expression exp) {
        return false;
    }

    @Override
    public <T> T oclAsType(Classifier<T> typespec) {
        return null;
    }

    @Override
    public Boolean oclIsInvalid() {
        return null;
    }

    @Override
    public Boolean oclIsKindOf(Classifier typespec) {
        return null;
    }

    @Override
    public Boolean oclIsTypeOf(Classifier typespec) {
        return null;
    }

    @Override
    public Boolean oclIsUndefined() {
        return null;
    }

    @Override
    public Boolean different(Any other) {
        return null;
    }

    @Override
    public Boolean equals(Any other) {
        return null;
    }

    @Override
    public Boolean lessThan(Any other) {
        return null;
    }

    @Override
    public Boolean greaterThan(Any other) {
        return null;
    }

    @Override
    public Boolean lessThanOrEqualTo(Any other) {
        return null;
    }
}
