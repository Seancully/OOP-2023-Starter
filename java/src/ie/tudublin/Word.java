package ie.tudublin;

import java.util.ArrayList;

public class Word {
    
    String word;

    ArrayList<Follow> follows = new ArrayList<Follow>();

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<Follow> getFollows() {
        return follows;
    }

    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }

    public Word(String word, ArrayList<Follow> follows) {
        this.word = word;
        this.follows = follows;
    }

    @Override
    public String toString() {
        String s = word + " follows: ";


        for (Follow f : follows) {
            s += f.getWord() + " (" + f.getCount() + "), ";
        }
        return s;
    }

    // Write a method called findFollow(str)
    public Object findFollow(String str) {
        for (Follow f : follows) {
            if (f.getWord().equals(str)) {
                f.setCount(f.getCount() + 1);
                return f;
            }
            else return null;
        }
        
        Follow f = new Follow(str, 1);
        return follows.add(f);
    }

    

}
