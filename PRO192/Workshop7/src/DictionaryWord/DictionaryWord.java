/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DictionaryWord;

import java.util.Objects;

/**
 *
 * @author PC
 */
public class DictionaryWord implements Comparable<DictionaryWord> {

    private String word;
    private String meanings;

    public DictionaryWord() {
    }

    public DictionaryWord(String word, String meanings) {
        this.word = word;
        this.meanings = meanings;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeanings() {
        return meanings;
    }

    public void setMeanings(String meanings) {
        this.meanings = meanings;
    }

    @Override
    public int compareTo(DictionaryWord o) {
        return this.word.compareTo(o.word);
    }

    @Override
    public String toString() {
        return "" + word + "\n" + meanings;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.word);
        hash = 97 * hash + Objects.hashCode(this.meanings);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DictionaryWord other = (DictionaryWord) obj;
        if (!Objects.equals(this.word, other.word)) {
            return false;
        }
        if (!Objects.equals(this.meanings, other.meanings)) {
            return false;
        }
        return true;
    }
}
