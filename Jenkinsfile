pipeline{
	agent any 
	stages{
		stage('Desplegando artefacto'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
					echo 'Iniciando despliegue'
				
				rtMavenDeployer (
					id: 'BUBBLE_SORT',
					serverId: 'artifactory',
					releaseRepo: 'isp2',
					snapshotRepo: 'isp2',
				)
				rtMavenRun (
					pom: 'pom.xml',
					goals: 'install',
					deployerId: 'BUBBLE_SORT',
				)
					echo 'Finalizando Despliegue'
				
			
			}
		}
		
	}
}
