package com.br.body.Model;

public class Exercicio {
	
		private String nome;
		private int repeticoes;
		private String Tipo;
		private int series;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getRepeticoes() {
			return repeticoes;
		}
		public void setRepeticoes(int repeticoes) {
			this.repeticoes = repeticoes;
		}
		public String getTipo() {
			return Tipo;
		}
		public void setTipo(String tipo) {
			Tipo = tipo;
		}
		public int getSeries() {
			return series;
		}
		public void setSeries(int series) {
			this.series = series;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Exercicio [Nome= "+ nome +" Tipo= "+Tipo+" repeticoes= "+repeticoes+" series="+"]";
		}
		
		
		
		
		
		
}
