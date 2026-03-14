from qiskit import QuantumCircuit, transpile
from qiskit_aer import Aer

qc = QuantumCircuit(1, 1)
qc.h(0)
qc.measure(0, 0)

backend = Aer.get_backend('qasm_simulator') # Correct backend name
compiled_circuit = transpile(qc, backend)

job = backend.run(compiled_circuit, shots=1024)
result = job.result()
counts = result.get_counts()

print("measured results", counts)
print(qc)
