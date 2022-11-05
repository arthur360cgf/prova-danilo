package beecrownd;

import java.util.ArrayList;

public class Balao {
	public static void main(String[] args) {
	}
	
	void posicaoBalao(int[] coordenadaBalao,int[][] coordenadaLinha) {
		int coordYBalao = 0;
		int i = 0;
		double minorDistance = 10000001;
		int[] lineWithMinorDistance = null;
		
		while (coordenadaBalao.length > i) {
			for(int j = 0; j < coordenadaLinha.length; j++) {
				int coordInitYLine = coordenadaLinha[j][1];
				int coordFinalYLine = coordenadaLinha[j][3];
				int coordInitXLine = coordenadaLinha[j][0];
				int coordFinalXLine = coordenadaLinha[j][2];
				int smallestCoordX = coordInitXLine < coordFinalXLine ? coordInitXLine :coordFinalXLine;
				int biggerCoordX = coordInitXLine < coordFinalXLine ? coordFinalXLine : coordInitXLine;
				
				double m = (coordInitYLine - coordFinalYLine) / (coordInitYLine + (coordInitXLine- coordFinalXLine));
				double line = coordInitYLine + (m*(coordenadaBalao[i]- coordInitXLine));
			
				if(line - coordYBalao > 0 && minorDistance > (line - coordYBalao) && coordenadaBalao[i] >= smallestCoordX &&coordenadaBalao[i] <= biggerCoordX) {
					minorDistance = line - coordYBalao;
					lineWithMinorDistance = coordenadaLinha[j];
				}
		}
		
		if(lineWithMinorDistance.equals(null)) {
			System.out.println(coordenadaBalao[i]);
			coordYBalao = 0;
			i++;
			lineWithMinorDistance.equals(null);
			minorDistance = 10000001;
			continue;
		}
		if(lineWithMinorDistance[1] == lineWithMinorDistance[3]) {
			int coordX = coordenadaBalao[i];
			int coordYLine = lineWithMinorDistance[1];
			
			System.out.printf("%i %i", coordX, coordYLine);
			
			coordYBalao = 0;
			i++;
			lineWithMinorDistance = null;
			minorDistance = 10000001;
			continue;
			
		}
		if(lineWithMinorDistance != null && lineWithMinorDistance.length > 0) {
			coordenadaBalao[i] = lineWithMinorDistance[3] lineWithMinorDistance[1];
		}
	}
}
	}
