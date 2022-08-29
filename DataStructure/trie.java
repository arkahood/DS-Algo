package DataStructure;

public class trie {
    trieNode root;
    trie(){
        root = new trieNode();
    }

    void insert(String word){
        trieNode temp = root;
        for(int i=0;i<word.length();i++){
            if(!temp.contains(word.charAt(i))){
                temp.put(word.charAt(i),new trieNode());
            }
            temp = temp.get(word.charAt(i));
        }
        temp.setFlag();
    }
    boolean search(String word){
        trieNode temp = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.contains(ch)) return false;
            temp = temp.get(ch);
        }
        return temp.flag;
    }
    boolean startsWith(String word){
        trieNode temp = root;
        for(char ch : word.toCharArray()){
            if(!temp.contains(ch)) return false;
            temp = temp.get(ch);
        }
        return true;
    }



    public static void main(String[] args) {
        trie t = new trie();
        t.insert("word");
        System.out.println(t.search("word"));
        System.out.println(t.startsWith("wor"));
        System.out.println(t.search("wor"));
    }
}

class trieNode{
    trieNode[] links;
    boolean flag;
    trieNode(){
        links = new trieNode[26];
        flag = false;
    }
    boolean contains(char ch){
        if(links[ch-'a']!=null) return true;
        return false;
    }
    void put(char ch, trieNode n){
        links[ch-'a'] = n;
    }
    trieNode get(char ch){
        return links[ch-'a'];
    }
    void setFlag(){
        this.flag = true;
    }
}
