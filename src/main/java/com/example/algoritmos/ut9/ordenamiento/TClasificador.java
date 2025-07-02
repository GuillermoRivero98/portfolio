package com.example.algoritmos.ut9.ordenamiento;

public class TClasificador {
	public static final int METODO_CLASIFICACION_INSERCION = 1;
	public static final int METODO_CLASIFICACION_SHELL = 2;
	public static final int METODO_CLASIFICACION_BURBUJA = 3;
	public static final int METODO_CLASIFICACION_QUICKSORT = 4;

	public int[] clasificar(int[] datosParaClasificar, int metodoClasificacion) {
		switch (metodoClasificacion) {
			case METODO_CLASIFICACION_INSERCION:
				return ordenarPorInsercion(datosParaClasificar);
			case METODO_CLASIFICACION_SHELL:
				return ordenarPorShell(datosParaClasificar);
			case METODO_CLASIFICACION_BURBUJA:
				return ordenarPorBurbuja(datosParaClasificar);
			case METODO_CLASIFICACION_QUICKSORT:
				return ordenarPorQuickSort(datosParaClasificar);
			default:
				System.err.println("Este codigo no deberia haberse ejecutado");
				break;
		}
		return datosParaClasificar;
	}

	protected int[] ordenarPorQuickSort(int[] datosParaClasificar) {
		quicksort(datosParaClasificar, 0, datosParaClasificar.length - 1);
		return datosParaClasificar;
	}

private void quicksort(int[] arr, int izq, int der) {
    if (izq >= der) return;

    int pivote = medianaDeTres(arr, izq, der);

    int i = izq;
    int j = der;

    while (i <= j) {
        while (arr[i] < pivote) i++;
        while (arr[j] > pivote) j--;

        if (i <= j) {
            intercambiar(arr, i, j);
            i++;
            j--;
        }
    }

    if (izq < j) quicksort(arr, izq, j);
    if (i < der) quicksort(arr, i, der);
}


	private int particionar(int[] arr, int izq, int der) {
		int pivote = arr[der];
		int i = izq - 1;
		for (int j = izq; j < der; j++) {
			if (arr[j] <= pivote) {
				i++;
				intercambiar(arr, i, j);
			}
		}
		intercambiar(arr, i + 1, der);
		return i + 1;
	}

	private void intercambiar(int[] vector, int pos1, int pos2) {
		int temp = vector[pos2];
		vector[pos2] = vector[pos1];
		vector[pos1] = temp;
	}

	private int[] ordenarPorShell(int[] datosParaClasificar) {
		int j;
		int[] incrementos = new int[] { 3223, 358, 51, 10, 3, 1 };
		for (int inc : incrementos) {
			if (inc < datosParaClasificar.length) {
				for (int i = inc; i < datosParaClasificar.length; i++) {
					int temp = datosParaClasificar[i];
					j = i;
					while (j >= inc && datosParaClasificar[j - inc] > temp) {
						datosParaClasificar[j] = datosParaClasificar[j - inc];
						j -= inc;
					}
					datosParaClasificar[j] = temp;
				}
			}
		}
		return datosParaClasificar;
	}

	protected int[] ordenarPorInsercion(int[] datosParaClasificar) {
		for (int i = 1; i < datosParaClasificar.length; i++) {
			int valorActual = datosParaClasificar[i];
			int j = i - 1;
			while (j >= 0 && datosParaClasificar[j] > valorActual) {
				datosParaClasificar[j + 1] = datosParaClasificar[j];
				j--;
			}
			datosParaClasificar[j + 1] = valorActual;
		}
		return datosParaClasificar;
	}

	private int[] ordenarPorBurbuja(int[] datosParaClasificar) {
		int n = datosParaClasificar.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (datosParaClasificar[j] > datosParaClasificar[j + 1]) {
					intercambiar(datosParaClasificar, j, j + 1);
				}
			}
		}
		return datosParaClasificar;
	}

	private int medianaDeTres(int[] arr, int izq, int der) {
    int centro = (izq + der) / 2;

    int a = arr[izq];
    int b = arr[centro];
    int c = arr[der];

    if ((a <= b && b <= c) || (c <= b && b <= a)) return b;
    if ((b <= a && a <= c) || (c <= a && a <= b)) return a;
    return c;
}
}