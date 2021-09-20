package org.atlanmod.ocl

interface Any {

    /**
     * Returns self statically typed as typespec if it is an instance of this type.
     * *Note* that this does not alter the runtime value of self,
     * * it only enables access to subtype operations.
     * This operation allows users to cast self to another type.
     *
     * @param typespec
     * @return
     */
    public <T> T oclAsType(Classifier<T> typespec);

    /**
     * Returns true if self is equal to *invalid*.
     * @return
     */
    public Boolean oclIsInvalid();

    /**
     * Returns true if the type of self corresponds to the type or supertype of typespec, false otherwise.
     * This operation allows users to check the class hierarchy of self much like would an instanceof Java.
     *
     * @param typespec
     * @return
     */
    public Boolean oclIsKindOf(Classifier typespec);

    /**
     * Returns true if the type of self is the same as typespec, or false otherwise.
     * This operation allows users to check the exact class type of self.
     *
     * @param typespec
     * @return
     */
    public Boolean oclIsTypeOf(Classifier typespec);

    /**
     * Returns true if self is equal to invalid or null.
     *
     * @return
     */
    public Boolean oclIsUndefined();

    /**
     * Returns true if self is a different object from other.
     *
     * @param other
     * @return
     */
    public Boolean different(Any other);

    /**
     * Returns true if self is equal to other.
     * @param other
     * @return
     */
    public Boolean equals(Any other);


    /**
     * Returns true if self is comparable to object and less than object.
     *
     * @param other
     * @return
     */
    public Boolean lessThan(Any other);

    /**
     * Returns true if self is comparable to object and greater than other.
     * @param other
     * @return
     */
    public Boolean greaterThan(Any other);

    /**
     * Returns true if self is comparable to object and less than or equal to other.
     * @param other
     * @return
     */
    public Boolean lessThanOrEqualTo(Any other);
}
