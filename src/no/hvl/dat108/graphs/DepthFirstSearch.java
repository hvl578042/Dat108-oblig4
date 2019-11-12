/**
 * 
 */
package no.hvl.dat108.graphs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * @author tdoy
 *
 */
public class DepthFirstSearch {

	private String source;
	private Graph graph;

	public DepthFirstSearch(Graph graph, String source) {

		this.graph = graph;
		this.source = source;
	}

	public Set<String> doDepthFirstSearch() {

		Set<String> visited = new LinkedHashSet<String>();
		Stack<String> stack = new Stack<String>();

		// push the source in the stack

		// implement me

		return visited;
	}

	public Set<String> doDepthFirstSearchRecursive() {

		Set<String> visited = new LinkedHashSet<String>();
		List<Node> nodes = new ArrayList<Node>(graph.getAdjNodes().keySet());

		Node src = nodes.get(nodes.indexOf(new Node(source)));

		dfsRecursive(nodes, src, visited);

		return visited;
	}

	public void dfsRecursive(List<Node> nodes, Node src, Set<String> visited) {

		// implement me
		src.setVisited(true);
		visited.add(src.getName());

		for (Node node : graph.getAdjacentNodes(src.getName())) {
		node = nodes.get(nodes.indexOf(node));
		if (!node.isVisited()) {
			dfsRecursive(nodes, node, visited);
		}

	}

}}
