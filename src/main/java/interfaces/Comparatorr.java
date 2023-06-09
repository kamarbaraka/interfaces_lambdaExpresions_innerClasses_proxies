/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package interfaces;

@FunctionalInterface
public interface Comparatorr<T> {
    int compare(T one, T two);
}
