/*
Dada uma árvore binária, encontre o maior valor em cada nível.

    Solução:
        1- Utilizar um algoritmo para percorrer a árvore e uma lista auxiliar
        2- Para cada elemento e seu nível na árvore:
            Se a lista possuir o índica == nivel, substituir pelo maior valor
            Senão adicionar na lista
*/

package exercises;
import dataStructure.Tree;
import java.util.ArrayList;
import java.util.List;

public class HighestNodeValue {

    public static List<Integer> largestValue(Tree tree) {
        var list = new ArrayList<Integer>();
        solveTree(tree.root, 0, list);
        return list;
    }

    private static void solveTree(final Tree.Node node,
                                  final int level,
                                  final ArrayList<Integer> list) {
        if (node == null) return;
        if (level == list.size()) {
            list.add(node.value);
        } else {
            list.set(level, Math.max(list.get(level), node.value));
        }

        solveTree(node.left, level+1, list);
        solveTree(node.right, level+1, list);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(100);

        tree.insert(10);
        tree.insert(5);

        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(9);

        System.out.println(largestValue(tree));

    }
}
